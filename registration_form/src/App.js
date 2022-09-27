import './App.css';
import Register from "./pages/registration";
import { BrowserRouter,Switch,Route } from 'react-router-dom';
// import { Switch } from 'switch';
function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Switch>
          <Route path="/" exact>
            <Register/>
          </Route>
        </Switch>
      </BrowserRouter>
    </div>
  );
}

export default App;
