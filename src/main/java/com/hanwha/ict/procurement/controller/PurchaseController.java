package com.hanwha.ict.procurement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PurchaseController {
    
    @GetMapping("/main")
    @ResponseBody
    public String home() {
        return """
                    <!DOCTYPE html>
                    <html>
                      <head>
                        <meta charset="UTF-8">
                        <title>Hanwha ICT Purchase System</title>
                        <style>
                          body {
                            margin: 0;
                            font-family: 'Segoe UI', sans-serif;
                            background: url('/hanwha-bg.jpeg') center center no-repeat;
                            background-size: contain;
                            background-color: #d76613;
                            height: 100vh;
                            display: flex;
                            flex-direction: column;
                            align-items: center;
                            justify-content: flex-start;
                            color: #fff4e6;
                          }
                          h1 {
                            margin-top: 7rem;
                            font-size: 2.8em;
                            text-shadow: 1px 1px 4px #000000;
                          }
                          p {
                            margin-top: 10px;
                            font-size: 1.1em;
                            opacity: 0.9;
                          }
                          .login-box {
                            margin-top: 80px;
                            background-color: rgba(0, 0, 0, 0.5);
                            padding: 30px 40px;
                            border-radius: 8px;
                            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.3);
                          }
                          input {
                            display: block;
                            width: 220px;
                            padding: 10px;
                            margin: 10px 0;
                            border: none;
                            border-radius: 4px;
                          }
                          button {
                            width: 100%;
                            padding: 10px;
                            background-color: #ffa200;
                            border: none;
                            border-radius: 4px;
                            font-weight: bold;
                            cursor: pointer;
                            color: white;
                          }
                          button:hover {
                            background-color: #ff8a00;
                          }
                        </style>
                      </head>
                      <body>
                        <h1>Hanwha ICT Purchase System</h1>
                        <p>Welcome to the internal procurement platform</p>
                        <div class="login-box">
                          <form>
                            <input type="text" placeholder="ID" required />
                            <input type="password" placeholder="Password" required />
                            <button type="submit">Login</button>
                          </form>
                        </div>
                      </body>
                    </html>
                """;
    }
}