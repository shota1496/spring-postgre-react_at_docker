import React, { useState } from "react";

function App() {
  const [name, setName] = useState("");
  const [phone, setPhone] = useState("");
  const [message, setMessage] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();
    const res = await fetch("http://localhost:8080/api/contacts", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ name, phone }),
    });
    setMessage(res.ok ? "登録成功" : "エラー");
  };

  return (
    <div style={{ maxWidth: 320, margin: "40px auto" }}>
      <h2>新規登録</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <input
            placeholder="名前"
            value={name}
            onChange={(e) => setName(e.target.value)}
          />
        </div>
        <div>
          <input
            placeholder="電話番号"
            value={phone}
            onChange={(e) => setPhone(e.target.value)}
          />
        </div>
        <button type="submit">登録</button>
      </form>
      {message && <div>{message}</div>}
    </div>
  );
}
export default App;
