import React, { Component } from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import ArtistContainer from './containers/artists/ArtistContainer';
import MultiEventContainer from './containers/multiEvents/MultiEventContainer';
import SingleEventContainer from './containers/singleEvents/singleEventsContainer';
import DigitalAssetContainer from './containers/digitalAssets/DigitalAssetContainer';
import PermissionContainer from './containers/permissions/PermissionContainer';
import GroupContainer from './containers/groups/GroupContainer';
import NavBar from './NavBar';


class App extends Component {
  render() {
    return (
      <div>
        <Router>
          <React.Fragment>

            <h1 className = "main-title">Archive Database</h1>
            <NavBar/>
            <Switch>
              <Route exact path = "/artists" component = {ArtistContainer}/>
              <Route exact path = "/multiEvents" component = {MultiEventContainer}/>
              <Route exact path = "/singleEvents" component = {SingleEventContainer}/>
              <Route exact path = "/documents" component = {DigitalAssetContainer}/>
              <Route exact path = "/permissions" component = {PermissionContainer}/>
              <Route exact path = "/groups" component = {GroupContainer}/>
            </Switch>
          </React.Fragment>

        </Router>
      </div>
    );
  }
}

export default App;
