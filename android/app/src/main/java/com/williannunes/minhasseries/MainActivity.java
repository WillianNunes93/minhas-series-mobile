package com.williannunes.minhasseries;

import android.os.Bundle;
import android.webkit.WebSettings;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // O app carrega o site ao vivo do GitHub Pages: sem isso, o WebView
    // guarda a página em cache e a família fica presa numa versão antiga
    // sem saber que precisa limpar o cache manualmente.
    WebSettings settings = this.bridge.getWebView().getSettings();
    settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
  }
}
