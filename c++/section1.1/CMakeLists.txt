cmake_minimum_required(VERSION 3.3)
project(section1_1)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES main.cpp Submitting_Solutions/Submitting_Solutions.cpp Submitting_Solutions/Submitting_Solutions.h Submitting_Solutions/test.cpp Submitting_Solutions/test.h)
add_executable(section1_1 ${SOURCE_FILES})