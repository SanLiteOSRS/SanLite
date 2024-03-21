import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("wb")
	static Iterator field4675;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -7653010758668939065L
	)
	long field4676;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -6545887099209885385L
	)
	long field4666;
	@ObfuscatedName("al")
	public boolean field4665;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 1139078630527989975L
	)
	long field4668;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 5107382463968810817L
	)
	long field4669;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -2042036406760048143L
	)
	long field4670;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 282494099
	)
	int field4671;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -90523561
	)
	int field4667;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1422789313
	)
	int field4673;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1418530473
	)
	int field4672;

	public Timer() {
		this.field4676 = -1L; // L: 7
		this.field4666 = -1L; // L: 8
		this.field4665 = false; // L: 9
		this.field4668 = 0L; // L: 10
		this.field4669 = 0L; // L: 11
		this.field4670 = 0L; // L: 12
		this.field4671 = 0; // L: 13
		this.field4667 = 0; // L: 14
		this.field4673 = 0; // L: 15
		this.field4672 = 0; // L: 16
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	public void method8120() {
		this.field4676 = SecureRandomCallable.method2320(); // L: 19
	} // L: 20

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method8102() {
		if (this.field4676 != -1L) { // L: 23
			this.field4669 = SecureRandomCallable.method2320() - this.field4676; // L: 24
			this.field4676 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method8108(int var1) {
		this.field4666 = SecureRandomCallable.method2320(); // L: 30
		this.field4671 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1323143876"
	)
	public void method8104() {
		if (this.field4666 != -1L) { // L: 35
			this.field4668 = SecureRandomCallable.method2320() - this.field4666; // L: 36
			this.field4666 = -1L; // L: 37
		}

		++this.field4673; // L: 39
		this.field4665 = true; // L: 40
	} // L: 41

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1204226511"
	)
	public void method8105() {
		this.field4665 = false; // L: 44
		this.field4667 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	public void method8123() {
		this.method8104(); // L: 49
	} // L: 50

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "70494875"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4669; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field4668; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field4670; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field4671); // L: 74
		var1.writeShort(this.field4667); // L: 75
		var1.writeShort(this.field4673); // L: 76
		var1.writeShort(this.field4672); // L: 77
	} // L: 78
}
