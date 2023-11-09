import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
public class class53 extends Node {
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	class47 field352;

	public class53() {
		this.field352 = null; // L: 9
	} // L: 10

	@ObfuscatedSignature(
		descriptor = "(Lcr;)V"
	)
	class53(VorbisSample var1) {
		this.field352 = new class47(var1, (RawSound)null); // L: 13
	} // L: 14

	@ObfuscatedSignature(
		descriptor = "(Lbm;)V"
	)
	public class53(RawSound var1) {
		this.field352 = new class47((VorbisSample)null, var1); // L: 17
	} // L: 18

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "65"
	)
	public boolean method1056() {
		return this.field352 == null; // L: 21
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lbm;",
		garbageValue = "-420394585"
	)
	public RawSound method1059() {
		if (this.field352 != null && this.field352.field318.tryLock()) { // L: 25
			RawSound var1 = this.method1057(); // L: 26
			this.field352.field318.unlock(); // L: 27
			return var1; // L: 28
		} else {
			return null; // L: 30
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Lbm;",
		garbageValue = "55"
	)
	public RawSound method1062() {
		if (this.field352 != null) { // L: 34
			this.field352.field318.lock(); // L: 35
			RawSound var1 = this.method1057(); // L: 36
			this.field352.field318.unlock(); // L: 37
			return var1; // L: 38
		} else {
			return null; // L: 40
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lbm;",
		garbageValue = "104"
	)
	RawSound method1057() {
		if (this.field352.field320 == null) { // L: 44
			this.field352.field320 = this.field352.field317.toRawSound((int[])null); // L: 45
			this.field352.field317 = null; // L: 46
		}

		return this.field352.field320; // L: 48
	}
}
