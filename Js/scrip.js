//TotaalPrijs 
var totaalPrijs = 0;


//Side Effects
function fluent(fn)
{
   return function(...args)
   {
    fn.apply(this, args);
    return this;
   }
}

function Fruitsap(){}

//Impure Function
Fruitsap.prototype.fruitSapVal = fluent(function (extra,cost)
{
    this.extra = extra;
    this.cost = cost;

    totaalPrijs = totaalPrijs + cost;
})

//pure Function
Fruitsap.prototype.fruitSapNamePrint = fluent(function()
{
    console.log(this.extra, this.cost);
    
})

//Impure Function
Fruitsap.prototype.totaalPrijs = fluent(function()
{
    console.log("");
    console.log("totaal prijs "+totaalPrijs +"€");
    
})

const menu = new Fruitsap();

menu.fruitSapVal("Cocosap", 0.80).fruitSapNamePrint().fruitSapVal("Suiker", 0.10).fruitSapNamePrint().fruitSapVal("GrootFormaat", 2.00).fruitSapNamePrint().fruitSapVal("BruisWater", 0.10).fruitSapNamePrint().totaalPrijs();

