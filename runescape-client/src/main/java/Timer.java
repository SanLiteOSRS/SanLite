import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -814727822440173205L
	)
	long field4553;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -7389893864857832963L
	)
	long field4549;
	@ObfuscatedName("ac")
	public boolean field4550;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -5882410713023998659L
	)
	long field4551;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -3471831164009854029L
	)
	long field4552;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 3423969543480093665L
	)
	long field4555;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1159049651
	)
	int field4548;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -99195749
	)
	int field4554;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1081412395
	)
	int field4556;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1610907721
	)
	int field4557;

	public Timer() {
		this.field4553 = -1L; // L: 7
		this.field4549 = -1L; // L: 8
		this.field4550 = false; // L: 9
		this.field4551 = 0L; // L: 10
		this.field4552 = 0L; // L: 11
		this.field4555 = 0L; // L: 12
		this.field4548 = 0; // L: 13
		this.field4554 = 0; // L: 14
		this.field4556 = 0; // L: 15
		this.field4557 = 0; // L: 16
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-92"
	)
	public void method7705() {
		this.field4553 = AttackOption.method2714(); // L: 19
	} // L: 20

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2047491410"
	)
	public void method7711() {
		if (this.field4553 != -1L) { // L: 23
			this.field4552 = AttackOption.method2714() - this.field4553; // L: 24
			this.field4553 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "19"
	)
	public void method7707(int var1) {
		this.field4549 = AttackOption.method2714(); // L: 30
		this.field4548 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	public void method7708() {
		if (-1L != this.field4549) { // L: 35
			this.field4551 = AttackOption.method2714() - this.field4549; // L: 36
			this.field4549 = -1L; // L: 37
		}

		++this.field4556; // L: 39
		this.field4550 = true; // L: 40
	} // L: 41

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1872946463"
	)
	public void method7717() {
		this.field4550 = false; // L: 44
		this.field4554 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1734091405"
	)
	public void method7726() {
		this.method7708(); // L: 49
	} // L: 50

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-674381487"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4552; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field4551; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field4555; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field4548); // L: 74
		var1.writeShort(this.field4554); // L: 75
		var1.writeShort(this.field4556); // L: 76
		var1.writeShort(this.field4557); // L: 77
	} // L: 78
}
