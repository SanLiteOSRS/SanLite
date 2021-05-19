import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class13 extends class14 {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1404988967
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -8402859884064294097L
	)
	long field124;
	@ObfuscatedName("c")
	String field120;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class13(class2 var1) {
		this.this$0 = var1;
		this.field124 = -1L;
		this.field120 = null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field124 = var1.readLong();
		}

		this.field120 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method120(this.field124, this.field120);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lev;",
		garbageValue = "1730592786"
	)
	public static VarcInt method210(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method2659(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lbc;",
		garbageValue = "-97122486"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? Messages.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lem;I)Z",
		garbageValue = "-2025189818"
	)
	static boolean method204(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = AttackOption.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	static final void method214() {
		Scene.Scene_isLowDetail = false;
		Client.isLowDetail = false;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-86"
	)
	static boolean method213() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
	}
}
