# -*- coding: utf-8 -*-


__author__ = 'Pulimootil'

"""
This class will handle all the file related operations
"""

import os
import cv2


class FileOperatoins(object):
    def __init__(self, filename, xmlFile):
        self.checkFile(filename, xmlFile)

    ''' Set the output folder '''

    def setOutput(self, outputFolder):
        self.outputFolder = outputFolder

    ''' Get the image file '''

    def getImage(self, color):
        if color:
            self.img = cv2.imread(self.imgFilename, 1)
        else:
            self.img = cv2.imread(self.imgFilename, 0)
        return self.img

    ''' Set the distorted image '''

    def setDistortedImage(self, img):
        self.distortedImage = img

    ''' Set the output image filename '''

    def setOutputImageName(self, tag):
        try:
            self.outputName = self.outputFolder + os.path.sep + \
                              os.path.splitext(os.path.basename(self.imgFilename))[0] + tag + \
                              os.path.splitext(self.imgFilename)[1]
        except AttributeError:
            # if output folder not set, current working directory will be used.
            self.setOutput(os.path.join(os.getcwd(), 'output'))
            self.setOutputImageName(tag)

    ''' Save the distorted image file '''

    def writeImage(self):
        try:
            cv2.imwrite(self.outputName, self.distortedImage)
        except AttributeError:
            print "Make sure that OutputImageName and Distorted images are set"

    ''' Display the image '''

    def show(self, orig):
        cv2.namedWindow("Image")
        cv2.imshow("Image", orig)
        cv2.waitKey(0)
        cv2.destroyAllWindows()

    ''' Check for valid files '''

    def checkFile(self, imgfilename, xmlFilename):
        if os.path.isfile(imgfilename):
            self.imgFilename = imgfilename
        else:
            raise 'Invalid image filename:' + imgfilename

        if os.path.isfile(xmlFilename):
            self.xmlFilename = xmlFilename
        else:
            raise 'Invalid xml filename:' + xmlFilename
