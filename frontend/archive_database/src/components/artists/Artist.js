import React from "react";
import moment from "moment";

const Artist = (props) => {

  if(!props.artist){
    return null;
  }


  const dateBasic = props.artist.singleEvents.map((singleEvent)=>{
    return singleEvent.date
  })
  const slicedDate = dateBasic.slice(0,10)

  const formattedDate = moment(slicedDate).format("dddd Do MMM YYYY");

  let time = dateBasic.slice(11,16)

  const id = props.artist.id

  const groups = props.artist.groups.map((group, index)=>{
    return <p key={index}>{group.name}</p>
  })

  const singleEvents = props.artist.singleEvents.map((singleEvent, index) => {
    return <p key={index}>{singleEvent.title}</p>
  })

  return(
    <div className = "single-artist">

      <a href={'/artists/'+id}>{props.artist.name}</a>
      <p>Name: {props.artist.name}</p>
      <p>Country: {props.artist.country}</p>
      <ul>Groups: {groups}</ul>
      <ul>SingleEvents: {singleEvents} {formattedDate} {time} </ul>

    </div>
  )
}
export default Artist;

// <div className = "single-artist">
// <Link to={'/artists/' +id} className="single-artist-link">
// <div className="artist-inner">
//   <p>Name: {props.artist.name}</p>
//   <p>Country: {props.artist.country}</p>
//   <p>Groups: {groups}</p>
//   <p>SingleEvents: {singleEvents} {formattedDate} {time} </p>
// </div>
// </Link>
// </div>


// render(){
//     const filmNodes = this.props.data.map(film =>{
//       return (
//         <Film
//         key={film.id}>
//         <a href={film.url}>{film.name}</a>
//         </Film>
//       )
//     })
