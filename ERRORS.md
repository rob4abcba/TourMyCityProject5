
dainantonio (ABND) [Oct 28th at 7:24 PM]
Can someone please check this project for me? it is building successfully but the app crashes

https://github.com/dainantonio/TourMyCityProject5.git
GitHub
dainantonio/TourMyCityProject5
tour guide app . it runs with toolbar and tablayout and view pager. The data not showing up though. working on it - dainantonio/TourMyCityProject5
 


12 replies
Jose ABND [7 days ago]
installing your app... crashes immediately.... why do you have two activity.xml files??

Jose ABND [7 days ago]
your problem so far seems to be your image

Jose ABND [7 days ago]
java.lang.NullPointerException: Attempt to invoke virtual method 'android.view.View android.view.View.findViewById(int)' on a null object reference
       at com.example.therussells.tourmycityproject5.DisplayAdapter.getView(DisplayAdapter.java:38)

Jose ABND [7 days ago]
that's the logcat error

Jorge E. Covarrubias (ABND) [7 days ago]
@Jose ABND hit it on the head.  Your image views should read.
ImageView imageView = listItemView not converView


Jorge E. Covarrubias (ABND) [7 days ago]
@dainantonio (ABND) like this
ImageView imageView = listItemView.findViewById(R.id.image);

Jorge E. Covarrubias (ABND) [7 days ago]
After I did that, I got some more errors from lines 57 - 62. I commented them out and was able to get your app to run. So there are a few things to still fix.


Jorge E. Covarrubias (ABND) [7 days ago]
@dainantonio (ABND) here is what I do to check the logcat. I open it up at the bottom right of android studio. when i am ready, I click the run app button and then right click within the logcat window and clearlog. That way I can quickly catch the error lines and go from there. hopefully that helps you a little bit.
 

Jose ABND [7 days ago]
looks like he's away from his computer, I sent him a PM thanks for your help @Jorge E. Covarrubias (ABND)
 


dainantonio (ABND) [7 days ago]
thanks @Jose ABND @Jorge E. Covarrubias (ABND) . I checked logcat and found error  in line 56 and 59. I commented out those and the app launched. Now I need to figure out what is going on there.



Jose ABND [7 days ago]
great! I'll be here for another hour or so if you need more help



dainantonio (ABND) [6 days ago]
can you look at this project again for me? @Jorge E. Covarrubias (ABND) @Jose ABND . SiteAdapter, I checked logcat but now not sure what it causing the crash after I add the recyclerview
