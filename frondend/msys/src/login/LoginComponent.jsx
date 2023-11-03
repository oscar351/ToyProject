import React, { useState } from "react";
// import { useNavigate } from "react-router-dom";
import { login } from "../apis/api/userManage"
import { LoginData } from "../apis/services/post"
import KakaoLogin from "./kakaoLogin";

function LoginComponent() {   

  const [userId, setUserId] = useState("");
  const [password, setPassword] = useState("");

  // const navigate = useNavigate();

  async function submit() {
    await login(userId, password)
        // .then(LoginData)
        .then((res) => console.log(res))
  }

  return (
    <div>
      <input value={userId} onChange={(e) => setUserId(e.target.value)} />
      <input value={password} onChange={(e) => setPassword(e.target.value)} />
      <button onClick={submit}>로그인</button>
      <KakaoLogin/>
    </div>
  );
}

export default LoginComponent