import java.io.File;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header; 
import org.apache.http.HttpEntity; 
import org.apache.http.HttpResponse; 
import org.apache.http.StatusLine; 
import org.apache.http.client.HttpClient; 
import org.apache.http.client.methods.HttpGet; 
import org.apache.http.client.methods.HttpPost; 
import org.apache.http.entity.StringEntity; 
import org.apache.http.impl.client.DefaultHttpClient; 
import org.apache.http.util.EntityUtils; 
import org.apache.http.entity.*;
import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.entity.mime.*;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.methods.CloseableHttpResponse;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

public class upload {
	public static void main(String args[]) {
		String url = "http://180.69.217.73:8080/OneOOMT/upload";

		HttpClient httpclient = new DefaultHttpClient(); 
		HttpPost httpPost = new HttpPost(url);

		File payload = new File("/tmp/commons-logging-1.2.jar");	
		HttpEntity entity = MultipartEntityBuilder.create()
			.setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
			.addPart("file", new FileBody(payload))
			.build();
		httpPost.setEntity(entity);
		try{
			HttpResponse response = httpclient.execute(httpPost);
		}catch(Exception e) {
		}
	}
}

