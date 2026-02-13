# Unit 5 - Personal Narrative / Interest Animation

## Introduction

Images are often used to portray our personal experiences and interests. We also use image filters and effects to change or enhance the mood of an image. When combined into collages and presentations, these images tell a story about who we are and what is important to us. Your goal is to create an animation using The Theater and Scene API that consists of images of your personal experiences and/or interests. In this animation, you will incorporate data related to these experiences and/or interests that can be organized in a 2D array, and use image filters and effects to change or enhance the mood of your images.
## Requirements

Use your knowledge of object-oriented programming, two-dimensional (2D) arrays, and algorithms to create your personal narrative collage or animation:
- **Write Scene subclasses** – Create two Scene subclasses: either two core parts of your personal life, or two components of a personal interest. Each class must contain a constructor and private instance variable with data related to the scene
- **Create at least two 2D arrays** – Create at least two 2D arrays to store the data that will make up your visualization.
Implement algorithms – Implement one or more algorithms that use loops and logic that operate on the data in your 2D arrays.
- **Create a visualization** – Create an animation that conveys the story of the data by illustrating the patterns or relationships in the data.
- **Image Filters** – Utilize the image filters created in this unit (and possible new filters) that show a personal flare to the images used in your animation.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put an image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get displayed on this README.

![UML Diagram for my project](UML.png)

## Video

Record a short video of your story to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown

[![Thumbnail for my projet](ThumbNail.png)]([youtube-URL-here](https://youtube.com/shorts/vcViRzIy4E8?feature=share))

## Story Description

This week, I've been feeling very unmotivated. To the point where I took short naps in some of my classes and just didn't want to do any homework at all. This animation shows my feelings, before the introduction to this project and upon finding out and doing this project. The data included in my project is the name of the image file and the caption for the images. They are stored in 2, 2d arrays and utilized for each scene class.


## Image Filter Analysis


The sepia filter changes each pixel’s red, green, and blue values using a special formula that mixes them together in different amounts. Red is increased the most, green is adjusted slightly less, and blue is reduced the most.

Because of this shift, the image takes on a warm brown tone, similar to old photographs. The new RGB values replace the original ones, giving the whole image a vintage effect. I used this because I want myself *in a balaclava* look like an old image of someone with a thousand yard stare...


The black and white filter removes color by averaging the red, green, and blue values of each pixel. That average becomes the new value for all three color channels.

Since red, green, and blue are now equal, the pixel no longer has color — only brightness. Lighter averages create lighter pixels, and darker averages create darker ones, resulting in a grayscale image. I chose this because I wanted the image to look old like a shell shocked soldier. Especially since I was wearing airsoft gear.
