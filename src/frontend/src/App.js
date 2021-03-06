import { BrowserRouter, Route, Switch } from 'react-router-dom';
import './App.css';
import Home from './Components/Home';
import AddPost from './Components/AddPost';
import AllPost from './Components/AllPost';
import Login from './Components/Login';
import Register from './Components/Register';
import Navbar from './Components/Navbar';
import Footer from './Components/Footer'

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Navbar/>
        <Switch>
          <Route path='/' exact component={AllPost}/>
          <Route path='/home' component={Home}/>
          <Route path='/addPost' component={AddPost}/>
          <Route path='/login' component={Login}/>
          <Route path='/register' component={Register}/>
        </Switch>
        <Footer/>
      </BrowserRouter>
    </div>
  );
}

export default App;
