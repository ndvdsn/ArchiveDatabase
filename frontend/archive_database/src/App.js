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

            <div>
            <Route exact path = "/artists" component = {ArtistContainer}/>
            </div>
            <div>
            <Route exact path = "/multiEvents" component = {MultiEventContainer}/>
            </div>
            <div>
            <Route exact path = "/singleEvents" component = {SingleEventContainer}/>
            </div>
            <div>
            <Route exact path = "/documents" component = {DigitalAssetContainer}/>
            </div>
            <div>
            <Route exact path = "/permission" component = {PermissionContainer}/>
            </div>
            <div>
            <Route exact path = "/groups" component = {GroupContainer}/>
            </div>
            </Switch>
          </React.Fragment>
        </Router>
      </div>
    );
  }
}

export default App;
