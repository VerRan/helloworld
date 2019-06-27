curl -o rotary.py https://s3.amazonaws.com/sumerian-cfn-templates/rotary.py

import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BCM)

GPIO.setup(17, GPIO.OUT)
GPIO.output(17, GPIO.HIGH)

time.sleep(3)

GPIO.output(17, GPIO.LOW)
GPIO.cleanup()
