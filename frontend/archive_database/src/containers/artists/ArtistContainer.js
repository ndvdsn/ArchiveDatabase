import React from "react";
import Request from "../../helpers/request";
import ArtistList from "../../components/artists/ArtistList";


class ArtistContainer extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      artists:[]
    }
  }
  componentDidMount(){
    const request = new Request();
    request.get('/api/artists')
    .then(data => {
      this.setState({artists:data._embedded.artists})
    })
  }

  render(){
    return (
      <>
      <h1> Artists </h1>
      <div className = "artist-container">
      <ArtistList
      artists={this.state.artists}

      />
      </div>
      </>
    )
  }
}
export default ArtistContainer;
