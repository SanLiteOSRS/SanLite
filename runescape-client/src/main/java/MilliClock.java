import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1292974499
	)
	static int field1523;
	@ObfuscatedName("ab")
	static Image field1527;
	@ObfuscatedName("f")
	long[] field1518;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1121640641
	)
	int field1519;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1291175111
	)
	int field1521;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = 6157496358684260999L
	)
	long field1520;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -15673867
	)
	int field1522;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -668116803
	)
	int field1525;

	public MilliClock() {
		this.field1518 = new long[10];
		this.field1519 = 256;
		this.field1521 = 1;
		this.field1522 = 0;
		this.field1520 = ClientPacket.currentTimeMillis();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1518[var1] = this.field1520;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-111"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1518[var1] = 0L;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-104"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1519;
		int var4 = this.field1521;
		this.field1519 = 300;
		this.field1521 = 1;
		this.field1520 = ClientPacket.currentTimeMillis();
		if (this.field1518[this.field1525] == 0L) {
			this.field1519 = var3;
			this.field1521 = var4;
		} else if (this.field1520 > this.field1518[this.field1525]) {
			this.field1519 = (int)((long)(var1 * 2560) / (this.field1520 - this.field1518[this.field1525]));
		}

		if (this.field1519 < 25) {
			this.field1519 = 25;
		}

		if (this.field1519 > 256) {
			this.field1519 = 256;
			this.field1521 = (int)((long)var1 - (this.field1520 - this.field1518[this.field1525]) / 10L);
		}

		if (this.field1521 > var1) {
			this.field1521 = var1;
		}

		this.field1518[this.field1525] = this.field1520;
		this.field1525 = (this.field1525 + 1) % 10;
		int var5;
		if (this.field1521 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field1518[var5] != 0L) {
					this.field1518[var5] += (long)this.field1521;
				}
			}
		}

		if (this.field1521 < var2) {
			this.field1521 = var2;
		}

		class18.method272((long)this.field1521);

		for (var5 = 0; this.field1522 < 256; this.field1522 += this.field1519) {
			++var5;
		}

		this.field1522 &= 255;
		return var5;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "70"
	)
	static int method2685(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class18.method271(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ClanChannelMember.method108(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = KitDefinition.method2778(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
