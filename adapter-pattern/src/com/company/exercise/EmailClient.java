package com.company.exercise;

import java.util.ArrayList;
import java.util.List;

public class EmailClient {
  private List<EmailProvider> providers = new ArrayList<>();

  public void addProvider(EmailProvider provider) {
    providers.add(provider);
  }

  public void downloadEmails() {
    for (EmailProvider provider : providers)
      provider.downloadEmails();
  }
}
