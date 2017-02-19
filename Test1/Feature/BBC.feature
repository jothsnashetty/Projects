Feature: Radio Nav Drawers
AS A user
I WANT to see more content associated with navigation links
So THAT I can easily find what I am looking for

Scenario Outline: Opening and closing the drawers
Given I can see the radio nav
When I select <section> in the radio nav
Then the <section> drawer is open
When I select <section> in the radio nav again
Then the <section> drawer is closed

Examples: of sections
| section|
| Stations |
| Categories |
| Schedules |

@todo

Scenario Outline: Opening a drawer should close the other drawers

Given I can see the radio nav
When I select <section> in the radio nav
Then the <section> drawer is open and the other drawers are closed
Examples: of sections
| section |
| Stations |
| Categories |
| Schedules |



@todo

Scenario: Selecting all categories navigates to all categories page

Given I can see the radio nav
When I select Categories in the radio nav
And I select the all categories link
Then I am on the all categories page

@todo 
Scenario: Selecting categories displays categories links   
Given I can see the radio nav   
When I select Categories in the radio nav   
Then I can see the following categories   
| Comedy  |   
| Drama   |   
| Factual |   
| Music   |  
| News    |  
| Science & Nature   |  
| History            |  
| Arts & Culture   |
| Politics              | 
| Entertainment   | 
| Religion   |  
| Performances & Events | 
| Documentaries   | 
| Readings   |   
| Podcasts      | 


@todo 
Scenario: Selecting aal stations should open stations page   
Given I can see the radio nav   
And All stations link after the national and nations stations inside the Stations drawer
When I select All stations in the radio nav   
Then I can see the Stations page   

@todo 
Scenario Outline: Selecting network displays networks page  
Given I can see the radio nav   
When I select <network> in the Stations drawer  
Then I can see the <network> page  
Examples: of sections
| network |
| Radio 1 |
| Radio 1Xtra |
| Radio 2 |
| Radio 3 |
| Radio 4 |
| Radio 4 Extra |
| Radio 5 live |
| Radio 5 live sports extra |
| Radio 6 Music |
| Asian Network |
| World Service |
| Radio Scotland |
| Radio nan Gàidheal Radio 1 |
| Radio Ulster |
| Radio Foyle |
| Radio Wales |
| Radio Cymru |
| Local Radio |


@todo 
Scenario: Selecting iPlayer Radio log should go to Radio homepage  
Given I can see the radio nav   
When I select iPlayer Radio log in the radio nav  
Then I can see the Radio homepage  





