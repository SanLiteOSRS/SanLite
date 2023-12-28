import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class147 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 8225525561408272315L
	)
	long field1650;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -926071349
	)
	public int field1655;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	IterableNodeDeque field1651;

	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	public class147(Buffer var1) {
		this.field1655 = -1; // L: 9
		this.field1651 = new IterableNodeDeque(); // L: 10
		this.method3250(var1); // L: 28
	} // L: 29

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "867669029"
	)
	void method3250(Buffer var1) {
		this.field1650 = var1.readLong(); // L: 32
		this.field1655 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class166(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class142(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class159(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class151(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class158(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class143(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class148(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class141(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class145(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class162(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class168(this);
			} else if (var2 == 10) {
				var3 = new class154(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class149(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class153(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class163(this);
			}

			((class144)var3).vmethod3510(var1); // L: 53
			this.field1651.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;B)V",
		garbageValue = "-115"
	)
	public void method3252(ClanSettings var1) {
		if (var1.field1722 == this.field1650 && this.field1655 == var1.field1701) { // L: 60
			for (class144 var2 = (class144)this.field1651.last(); var2 != null; var2 = (class144)this.field1651.previous()) { // L: 61
				var2.vmethod3506(var1); // L: 62
			}

			++var1.field1701; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "193145278"
	)
	static int method3256(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 5130
			boolean var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 5131
			class165.method3486(var3); // L: 5132
			return 1; // L: 5133
		} else {
			return 2; // L: 5135
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(IIIILuz;Lme;I)V",
		garbageValue = "2144355739"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12648
			int var6 = Client.camAngleY & 2047; // L: 12649
			int var7 = var3 * var3 + var2 * var2; // L: 12650
			if (var7 <= 6400) { // L: 12651
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12652
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12653
				int var10 = var3 * var8 + var9 * var2 >> 16; // L: 12654
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12655
				if (var7 > 2500) {
					var4.method9764(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12656
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12657
				}

			}
		}
	} // L: 12658
}
