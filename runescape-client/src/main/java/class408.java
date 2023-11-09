import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class408 extends class407 {
	@ObfuscatedName("aw")
	ArrayList field4532;

	@ObfuscatedSignature(
		descriptor = "(Lpp;Ljava/util/ArrayList;)V"
	)
	public class408(class407 var1, ArrayList var2) {
		super(var1); // L: 9
		this.field4532 = var2; // L: 10
		super.field4528 = "ConcurrentMidiTask"; // L: 11
	} // L: 12

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		for (int var2 = 0; var2 < this.field4532.size(); ++var2) { // L: 16
			class407 var3 = (class407)this.field4532.get(var2); // L: 17
			if (var3 == null) { // L: 18
				this.field4532.remove(var2); // L: 19
				--var2; // L: 20
			} else if (var3.vmethod7676(var1)) { // L: 23
				if (var3.method7668()) { // L: 24
					this.method7653(var3.method7651()); // L: 25
					this.field4532.clear(); // L: 26
					return true; // L: 27
				}

				if (var3.method7652() != null) { // L: 30
					this.field4532.add(var3.method7652()); // L: 31
				}

				super.field4526 = var3.field4526; // L: 33
				this.field4532.remove(var2); // L: 35
				--var2; // L: 36
			}
		}

		if (this.field4532.isEmpty()) { // L: 39
			return true; // L: 40
		} else {
			return false; // L: 42
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;IIS)Lpc;",
		garbageValue = "-2870"
	)
	public static Font method7672(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3); // L: 89
		boolean var4;
		if (var5 == null) { // L: 90
			var4 = false; // L: 91
		} else {
			VarbitComposition.SpriteBuffer_decode(var5); // L: 94
			var4 = true; // L: 95
		}

		if (!var4) { // L: 97
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3); // L: 99
			Font var8;
			if (var6 == null) { // L: 101
				var8 = null; // L: 102
			} else {
				Font var7 = new Font(var6, class492.SpriteBuffer_xOffsets, class134.SpriteBuffer_yOffsets, class172.SpriteBuffer_spriteWidths, class528.SpriteBuffer_spriteHeights, class528.SpriteBuffer_spritePalette, ArchiveDiskAction.SpriteBuffer_pixels); // L: 105
				class506.method8985(); // L: 106
				var8 = var7; // L: 107
			}

			return var8; // L: 109
		}
	}
}
