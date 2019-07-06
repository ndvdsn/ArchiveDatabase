import React, { Component } from 'react';
// import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import ArtistContainer from './containers/artists/ArtistContainer';
import MultiEventContainer from './containers/multiEvents/MultiEventContainer';
import SingleEventContainer from './containers/singleEvents/singleEventsContainer';
import DigitalAssetContainer from './containers/digitalAssets/DigitalAssetContainer';
import PermissionContainer from './containers/permissions/PermissionContainer';
import GroupContainer from './containers/groups/GroupContainer';

import './App.css';

class App extends Component {
  render() {
    return (
      <div>
        <div>
        <h1 className = "main-title">Archive Database</h1>
        </div>
        <div>
        <ArtistContainer/>
        </div>
        <div>
        <MultiEventContainer/>
        </div>
        <div>
        <SingleEventContainer/>
        </div>
        <div>
        <DigitalAssetContainer/>
        </div>
        <div>
        <PermissionContainer/>
        </div>
        <div>
        <GroupContainer/>
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
