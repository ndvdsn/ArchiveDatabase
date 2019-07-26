import React from "react";
// import moment from "moment";

const Artist = (props) => {

  if(!props.artist){
    return null;
  }

  const id = props.artist.id
  const artistName = props.artist.name;
  const artistCountry = props.artist.country;


  const artist_singleEvents = props.artist.singleEvents.map((singleEvent, index) => {
      return(
        <li key= {singleEvent.id} className = "artist-singleEvent">
        <div className="single-artist-singleEvent">
        {singleEvent.id}:
        </div><div>{singleEvent.title} {singleEvent.location}{singleEvent.venue}{singleEvent.date}{singleEvent.time}</div>
        </li>
      )
    })

  const artist_groups = props.artist.groups.map((group, index) => {
    return(
      <li key={group.id} className = "artist-group">
      <div className="single-artist-group">
      {group.id}
      </div><div>{group.name}</div>
      </li>
    )
  })

  return(
    <div className = "component">
      <ul>
        <div>
        <li><a href={'/artists/'+id}>{artistName}</a></li>
        </div>
        <div>
        <li>Country: {artistCountry}</li>
        </div>
        <div>
        </div>
        <h4>Participated in events:</h4>
        <div className="artist-singleEvent-container">
          <div>
          <ul>Title: {artist_singleEvents}</ul>
          </div>
          <div>
          <ul>Groups: {artist_groups}</ul>
          </div>
        </div>
      </ul>
    </div>
  )
}

export default Artist;


// const singleEvent = props.artist.singleEvents.map((singleEvent, index) => {
//   return <ul key={index}>{singleEvent.title} {singleEvent.location} {singleEvent.venue}</ul>
// })
//
// const location = props.artist.singleEvents.map((singleEvent, index) => {
//   return <ul key={index}>{singleEvent.location}</ul>
// })
//
// const venue = props.artist.singleEvents.map((singleEvent, index) => {
//   return <ul key={index}>{singleEvent.venue}</ul>
// })
//
// const dateBasic = props.artist.singleEvents.map((singleEvent)=>{
//   return singleEvent.date
// })
//
// const time = props.artist.singleEvents.map((singleEvent)=>{
//   return singleEvent.time
// })
// const slicedDate = dateBasic.slice(0,10)
//
// const formattedDate = moment(slicedDate).format("dddd Do MMM YYYY");
// const time = moment(slicedDate).format('hh:mm z','Europe/London');



// const groups = props.artist.groups.map((group, index)=>{
//   return <ul key={index}>{group.name}</ul>
// })
