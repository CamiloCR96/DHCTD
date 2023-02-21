import { useState } from 'react'
import imagen from './assets/1200985.jpg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="App">
      <div>
        <img src={imagen} className="logo" alt="imagen" />
        <ul>
          <li>primer punto</li>
          <li>segundo punto</li>
          <li>tercer punto</li>
          <li>cuarto punto</li>
        </ul>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </div>
  )
}

export default App
