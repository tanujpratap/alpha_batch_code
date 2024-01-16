import pygame
import sys
import time
pygame.init()
width=200
height=100
display=pygame.display.set_mode((width,height))
pygame.display.set_caption("")
clock=pygame.time.clock()
dark_gray=(23,32,42)
white=(230,230,230)
seconds=0
pause=False
font=pygame.font.SysFont("times new roman",24)
def close():
    pygame.quit()
    sys.exit()
