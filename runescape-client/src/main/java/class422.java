import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
public abstract class class422 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	class422 field4598;
	@ObfuscatedName("aj")
	String field4595;
	@ObfuscatedName("aq")
	String field4597;
	@ObfuscatedName("ar")
	boolean field4596;
	@ObfuscatedName("ag")
	boolean field4594;

	@ObfuscatedSignature(
		descriptor = "(Lqd;)V"
	)
	class422(class422 var1) {
		this.field4598 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public abstract boolean vmethod7975();

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1321933339"
	)
	public boolean method7949() {
		return this.field4596; // L: 17
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "91"
	)
	public boolean method7963() {
		return this.field4594; // L: 21
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-724601685"
	)
	public String method7952() {
		return "Error in task: " + this.field4597 + ", Error message: " + this.field4595; // L: 25
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lqd;",
		garbageValue = "-1413570045"
	)
	public class422 method7953() {
		return this.field4598; // L: 29
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-93"
	)
	void method7954(String var1) {
		this.field4596 = true; // L: 33
		this.field4595 = var1; // L: 34
	} // L: 35
}
