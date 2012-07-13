Feature: Replace naughty words in text
  In order to avoid offending watchers of teh new programs
  As a news reader
  I want a teleprompter that replaces bad words with nicer ones

  Scenario Outline:
    Given the data dictionary
    When convert the text <original>
    Then the resulting text should be <converted>

    Examples:
      | original                                                                                                             | converted                                                                                                             |
      | Last night a $dude$ named D. Gibbons, the Olympic $jock$, was stopped in his car by $the heat$.                      | Last night a man named D. Gibbons, the Olympic athlete, was stopped in his car by the police.                         |
      | He was coming from a $bash$ and appeared $battered$ to the $fuzz$.                                                   | He was coming from a party and appeared very intoxicated to the police.                                               |
      | On the backseat his $ball and chain$, famous for wearing very expensive $bling bling$, was $bunning$.                | On the backseat his wife, famous for wearing very expensive jewellery, was smoking marijuana.                         |
      | It $was batiste$ when he took the $cop$ for a $bad egg$ and tried to $cut a deal$ for $100.                          | It made matters worse when he took the policeman for a corrupt person and tried to make an agreement for $100.        |
      | He didn't have his driver's licence with him, claiming that his wallet was $whipped$ from him.                       | He didn't have his driver's licence with him, claiming that his wallet was stolen from him.                           |
      | As $the heat$ saw a $piece$ on the floor of the car, Gibbons $mits$ were cuffed.                                     | As the police saw a weapon on the floor of the car, Gibbons hands were cuffed.                                        |
      | The $dibble$ was later reported to have said that \"Gibbons was really screwed up - thank god he didn't go postal\". | The policeman was later reported to have said that \"Gibbons was really screwed up - thank god he didn't go postal\". |
      | Eventually the $bluecoats$ drove him and his $missus$ to their $crib$ - both await $phat$ legal charges.             | Eventually the officers drove him and his wife to their home - both await great legal charges.                        |


