Many modern programming are now designed to reusable and interchangeable, without breaking existing interconnections.

Tight Coupling
Tight Coupling mean class and objects are dependent on one another.
Tight coupling is the idea of binding resource to specific purposes and functions.
In the small we easily identify the changes and there is less chance miss anything. but in large application,
these inter-dependencies are not always knowns by every programmer and there is chance overlooking changes.
Example:
    We have Gun and Soldier class, that works nomarlly, but when we change weapon, then we must change 2 class, this make spend a lot of time to refactor all code.
Loose Coupling is a design goal to reduce the inter-dependencies between components of a system with goal of reducing the risk that changes in one component will require changes in any other component.
Looose Coupling is a much more generic concept intended to increase the flexibility of system, this make it more maintainable and make entire framework more stable.
Example:
    We have GunInter interface to inheriant for shortGun and thomsomGun, this help us change weapon easily, without affecting the soldier2 class.