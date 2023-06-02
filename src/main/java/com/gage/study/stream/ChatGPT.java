package com.gage.study.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatGPT {
    public static void main(String[] args) {
        //  接收ChatGPT流
        String endpoint = "https://chatbot.theb.ai/api/chat-processs";
        String apiKey = "YOUR_API_KEY";

        String prompt = "Hello, how can I assist you?";

        try {
            // {"prompt":"java 设计模式","options":{"parentMessageId":"chatcmpl-7M5MQVW9YbED5WYwliyHLzSLCxwAx"}}
            // 构建请求URL
            URL url = new URL(endpoint);

            // 创建连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
//            connection.setRequestProperty("Authorization", "Bearer " + apiKey);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("cookie", "_ga=GA1.1.114474869.1684985146; _ga_0MN0L0RJXZ=GS1.1.1685498152.2.1.1685498467.0.0.0");
            connection.setRequestProperty("referer", "https://chatbot.theb.ai/");
            connection.setRequestProperty("origin", "https://chatbot.theb.ai");
            connection.setRequestProperty("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36 Edg/112.0.1722.68");
            // 构建请求体
//            String requestBody = "{\"prompt\": \"" + prompt + "\", \"max_tokens\": 50}";
            String requestBody = "{\"prompt\":\"java 设计模式\",\"options\":{\"parentMessageId\":\"chatcmpl-7M5MQVW9YbED5WYwliyHLzSLCxwA1\"}}";

            // 启用输出流并写入请求体
            connection.setDoOutput(true);
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(requestBody.getBytes());
            outputStream.flush();
            outputStream.close();

            // 获取响应
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // 处理响应
                System.out.println("Response: " + response.toString());
            } else {
                System.out.println("Error: " + responseCode);
            }

            // 关闭连接
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
