import React, { Component } from 'react';
// import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import ArtistContainer from './containers/artists/ArtistContainer';
import MultiEventContainer from './containers/multiEvents/MultiEventContainer';

import './App.css';

class App extends Component {
  render() {
    return (
      <div>
      <div>
      <ArtistContainer/>
      </div>
      <div>
      <MultiEventContainer/>
      </div>
      </div>
    //   <div>
    //   <Router>
    //   <React.Fragment>
    // <h4 className="title">Archive Database</h4>
    // <Switch>
    //   <Route exact path = "/artists" component = {ArtistContainer}/>
    // </Switch>
    // </React.Fragment>
    // </Router>
    // </div>
    );
  }
}

export default App;