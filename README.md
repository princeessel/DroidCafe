# DroidCafe
Mock Dessert-ordering app that uses images as interactive elements.
In this project I have built a prototype of an app used to order dessert.
The user interface (UI) that appears on a screen of an Android-powered device consists of a hierarchy of objects called views. Every element of the screen is a View.
I added images to the layout and made these images clickable by adding android:onClick attribute in the XML.
I have implemented an option menu that has some of it's items as an overflow menu and some displayed on the app bar, 
example the order and status menu items are always going to be visible on the app bar whiles the favorites will be shown if there's room and the contact menu item is never going to be shown on the app bar but will be display as an overflow item.
When any of the menu items is clicked it's either display a toast message or take you to the OrderActivity where you can 
place your order.
Also I implemented a spinner on the phone number edit text to indicate which phone number you've entered.(whether Home,work or Mobile).
Also when any of the desserts is clicked it displays a toast message indicating which dessert you've ordered.


That's it !!!
