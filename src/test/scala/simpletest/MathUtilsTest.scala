package simpletest

import org.scalatest.FunSpec

/** BDD testing for MathUtils.
 *
 *  @describe behavior of double.
 *  @param int an integer to be doubled
 * {{{
 * val p = Person("Al", 42, 200.0)
 * p.name
 * p.age
 * p.weight
 * }}}
 *
 * Did you know: The [[com.acme.foo.Employee]] extends this class.
 */
class MathUtilsSpec extends FunSpec {
  
    describe("MathUtils::double") {

        it("should handle 0 as input") {
            val result = MathUtils.double(0)
            assert(result == 0)
        }

        it("should handle 1") {
            val result = MathUtils.double(1)
            assert(result == 1)
        }

        it("should handle really large integers") (pending)
        
    }

}
