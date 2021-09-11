// Simple mapping
<div className="App">
{
    people.map(person => <Card name={person.name} age={person.age}/>)
}
</div>
