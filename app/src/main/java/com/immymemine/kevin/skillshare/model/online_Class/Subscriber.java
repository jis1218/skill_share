package com.immymemine.kevin.skillshare.model.online_Class;

/**
 * Created by JisangYou on 2017-11-30.
 */

public class Subscriber
{
    private String recentTime;

    private String order;

    private String name;

    private String url;

    public String getRecentTime ()
    {
        return recentTime;
    }

    public void setRecentTime (String recentTime)
    {
        this.recentTime = recentTime;
    }

    public String getOrder ()
    {
        return order;
    }

    public void setOrder (String order)
    {
        this.order = order;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [recentTime = "+recentTime+", order = "+order+", name = "+name+", url = "+url+"]";
    }
}
