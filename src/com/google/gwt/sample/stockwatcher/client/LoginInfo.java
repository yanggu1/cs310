package com.google.gwt.sample.stockwatcher.client;

import java.io.Serializable;

public class LoginInfo implements Serializable {

  private boolean loggedIn = false;
  private String loginUrl;
  private String logoutUrl;
  private String emailAddress;
  private String nickname;

  private String superHero; 
  
  public void setSuperHero(String input){
	  superHero = input; 
  }

  public boolean isLoggedIn() {
    return loggedIn;
  }

  public void setLoggedIn(boolean loggedIn) {
    this.loggedIn = loggedIn;
  }

  public String getLoginUrl() {
    return loginUrl;
  }

  public void setLoginUrl(String loginUrl) {
    this.loginUrl = loginUrl;
  }

  public String getLogoutUrl() {
    return logoutUrl;
  }

  public void setLogoutUrl(String logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getNickname() {
    //return nickname;
	  return superHero; 
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

public void setAngField (String blah){
this.superHero = "I'm simply helping you with lab so I'm writing some dumb message here to irritate you ;)";
}

}
