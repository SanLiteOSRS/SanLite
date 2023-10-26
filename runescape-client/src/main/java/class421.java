import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public abstract class class421 {
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	class421 field4575;
	@ObfuscatedName("ax")
	String field4574;
	@ObfuscatedName("ao")
	String field4572;
	@ObfuscatedName("ah")
	boolean field4576;
	@ObfuscatedName("ar")
	boolean field4573;

	@ObfuscatedSignature(
		descriptor = "(Lqm;)V"
	)
	class421(class421 var1) {
		this.field4575 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public abstract boolean vmethod7780();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1050307233"
	)
	public boolean method7760() {
		return this.field4576; // L: 17
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "45"
	)
	public boolean method7762() {
		return this.field4573; // L: 21
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1522187493"
	)
	public String method7763() {
		return "Error in task: " + this.field4572 + ", Error message: " + this.field4574; // L: 25
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lqm;",
		garbageValue = "-1213560262"
	)
	public class421 method7764() {
		return this.field4575; // L: 29
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "225620137"
	)
	void method7773(String var1) {
		this.field4576 = true; // L: 33
		this.field4574 = var1; // L: 34
	} // L: 35

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1674491330"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}
}
