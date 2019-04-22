import React, {Component} from "react";
import SingleArtist from "../../components/artists/SingleArtist";
import Request from "../../helpers/request";

class SingleBookingContainer extends Component {
  constructor(props){
    super(props);
    this.state = {
      artist: null
    }
  }

  componentDidMount(){
    let request = new Request()
    const url = "/api/artists/" + this.props.id + '?projection=embedInfoInArtist'
    request.get(url).then(data => {
      this.setState({artist: data})
    })
  }

  render(){
    return(
      <SingleArtist artist={this.state.artist}/>
    )
  }
}
export default SingleArtistContainer;
