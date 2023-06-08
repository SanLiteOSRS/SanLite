import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 3344983247548410809L
	)
	long field4506;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -3844984739841209177L
	)
	long field4504;
	@ObfuscatedName("av")
	public boolean field4499;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 5725797799893562143L
	)
	long field4500;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -7760677433481046661L
	)
	long field4501;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -1102559983850000693L
	)
	long field4502;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1785572645
	)
	int field4497;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1813441365
	)
	int field4507;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1715839131
	)
	int field4505;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1187553919
	)
	int field4498;

	public Timer() {
		this.field4506 = -1L; // L: 7
		this.field4504 = -1L; // L: 8
		this.field4499 = false; // L: 9
		this.field4500 = 0L; // L: 10
		this.field4501 = 0L; // L: 11
		this.field4502 = 0L; // L: 12
		this.field4497 = 0; // L: 13
		this.field4507 = 0; // L: 14
		this.field4505 = 0; // L: 15
		this.field4498 = 0; // L: 16
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2089124905"
	)
	public void method7612() {
		this.field4506 = WallObject.method5027(); // L: 19
	} // L: 20

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1927932111"
	)
	public void method7608() {
		if (-1L != this.field4506) { // L: 23
			this.field4501 = WallObject.method5027() - this.field4506; // L: 24
			this.field4506 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1221021078"
	)
	public void method7609(int var1) {
		this.field4504 = WallObject.method5027(); // L: 30
		this.field4497 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1737596077"
	)
	public void method7610() {
		if (this.field4504 != -1L) { // L: 35
			this.field4500 = WallObject.method5027() - this.field4504; // L: 36
			this.field4504 = -1L; // L: 37
		}

		++this.field4505; // L: 39
		this.field4499 = true; // L: 40
	} // L: 41

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "431404039"
	)
	public void method7617() {
		this.field4499 = false; // L: 44
		this.field4507 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-613072356"
	)
	public void method7625() {
		this.method7610(); // L: 49
	} // L: 50

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "801850388"
	)
	@Export("write")
	public void write(Buffer var1) {
		class280.method5601(var1, this.field4501); // L: 53
		class280.method5601(var1, this.field4500); // L: 54
		class280.method5601(var1, this.field4502); // L: 55
		var1.writeShort(this.field4497); // L: 56
		var1.writeShort(this.field4507); // L: 57
		var1.writeShort(this.field4505); // L: 58
		var1.writeShort(this.field4498); // L: 59
	} // L: 60
}
