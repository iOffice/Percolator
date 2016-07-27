package com.Percolator.cronofy;


public enum CronofyGrantType {
  AUTHORIZATION_CODE("authorization_code"),
  REFRESH_TOKEN("refresh_token");

  private final String _name;

  CronofyGrantType(String name) {
    this._name = name;
  }

  @Override
  public String toString() {
    return this._name;
  }
}
