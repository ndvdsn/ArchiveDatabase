import React from "react";
// import moment from "moment";


const Artist = (props) => {

  if(!props.artist){
    return null;
  }


  const dateBasic = props.artist.singleEvents.map((singleEvent)=>{
    return singleEvent.date
  })

  const time = props.artist.singleEvents.map((singleEvent)=>{
    return singleEvent.time
  })
  // const slicedDate = dateBasic.slice(0,10)
  //
  // const formattedDate = moment(slicedDate).format("dddd Do MMM YYYY");
  // const time = moment(slicedDate).format('hh:mm z','Europe/London');

  const id = props.artist.id

  const groups = props.artist.groups.map((group, index)=>{
    return <ul key={index}>{group.name}</ul>
  })

  const singleEvent = props.artist.singleEvents.map((singleEvent, index) => {
    return <ul key={index}>{singleEvent.title}</ul>

  })

  const location = props.artist.singleEvents.map((singleEvent, index) => {
    return <ul key={index}>{singleEvent.location}</ul>
  })

  const venue = props.artist.singleEvents.map((singleEvent, index) => {
    return <ul key={index}>{singleEvent.venue}</ul>
  })

  return(
    <div className = "single-artist">
      <div className="details">
      <ul>
      <li><a href={'/artists/'+id}>{props.artist.name}</a></li>
      <li>Name: {props.artist.name}</li>
      <li>Country: {props.artist.country}</li>
      <li>Groups: {groups}</li>
      <li>Single Event Title: {singleEvent}  Date: {dateBasic} Time: {time} Location: {location} Venue: {venue}</li>
      </ul>
      </div>
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
