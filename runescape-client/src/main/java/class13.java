import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ai")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 935976865
	)
	static int field71;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 285
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 288
		if (var1 == null) { // L: 289
			var1 = new Hashtable(); // L: 290
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 292
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 293
		DataOutputStream var4 = new DataOutputStream(var3); // L: 294
		var4.writeShort(var2.length + 3); // L: 295
		var4.writeByte(0); // L: 296
		var4.writeShort(var2.length); // L: 297
		var4.write(var2); // L: 298
		var4.close(); // L: 299
		var1.put(0, var3.toByteArray()); // L: 300
		return var1; // L: 301
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 306
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "986853816"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = class31.World_worlds[var6]; // L: 180
			class31.World_worlds[var6] = class31.World_worlds[var1]; // L: 181
			class31.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				World var11 = class31.World_worlds[var9]; // L: 185
				int var12 = class297.compareWorlds(var11, var8, var2, var3); // L: 187
				int var10;
				if (var12 != 0) { // L: 188
					if (var3) { // L: 189
						var10 = -var12; // L: 190
					} else {
						var10 = var12; // L: 194
					}
				} else if (var4 == -1) { // L: 198
					var10 = 0; // L: 199
				} else {
					int var13 = class297.compareWorlds(var11, var8, var4, var5); // L: 202
					if (var5) { // L: 203
						var10 = -var13;
					} else {
						var10 = var13; // L: 204
					}
				}

				if (var10 <= 0) { // L: 206
					World var14 = class31.World_worlds[var9]; // L: 207
					class31.World_worlds[var9] = class31.World_worlds[var7]; // L: 208
					class31.World_worlds[var7++] = var14; // L: 209
				}
			}

			class31.World_worlds[var1] = class31.World_worlds[var7]; // L: 213
			class31.World_worlds[var7] = var8; // L: 214
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 215
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 216
		}

	} // L: 218

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZS)I",
		garbageValue = "511"
	)
	static int method175(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1585
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1602
				var7 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 1603
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1604
				if (var4 >= 1 && var4 <= 10) { // L: 1605
					class97 var8 = new class97(var4, var7.id, var7.childIndex, var7.itemId); // L: 1608
					Interpreter.field837.add(var8); // L: 1609
					return 1; // L: 1610
				} else {
					throw new RuntimeException(); // L: 1606
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1612
				Interpreter.Interpreter_intStackSize -= 3; // L: 1613
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1614
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1615
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1616
				if (var5 >= 1 && var5 <= 10) { // L: 1617
					class97 var6 = new class97(var5, var3, var4, class165.getWidget(var3).itemId); // L: 1620
					Interpreter.field837.add(var6); // L: 1621
					return 1; // L: 1622
				} else {
					throw new RuntimeException(); // L: 1618
				}
			} else {
				return 2; // L: 1624
			}
		} else if (Interpreter.field852 >= 10) { // L: 1586
			throw new RuntimeException(); // L: 1587
		} else {
			if (var0 >= 2000) { // L: 1590
				var7 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1591
			} else {
				var7 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 1593
			}

			if (var7.onResize == null) { // L: 1594
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1595
				var9.widget = var7; // L: 1596
				var9.args = var7.onResize; // L: 1597
				var9.field1049 = Interpreter.field852 + 1; // L: 1598
				Client.scriptEvents.addFirst(var9); // L: 1599
				return 1; // L: 1600
			}
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1117233973"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 364
		int var2 = var1.readUnsignedByte(); // L: 365
		int var3 = var1.readInt(); // L: 366
		if (var3 < 0 || AbstractArchive.field4220 != 0 && var3 > AbstractArchive.field4220) { // L: 367
			throw new RuntimeException(); // L: 368
		} else if (var2 == 0) { // L: 370
			byte[] var6 = new byte[var3]; // L: 371
			var1.readBytes(var6, 0, var3); // L: 372
			return var6; // L: 373
		} else {
			int var4 = var1.readInt(); // L: 376
			if (var4 >= 0 && (AbstractArchive.field4220 == 0 || var4 <= AbstractArchive.field4220)) { // L: 377
				byte[] var5 = new byte[var4]; // L: 380
				if (var2 == 1) { // L: 381
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 382
				}

				return var5; // L: 383
			} else {
				throw new RuntimeException(); // L: 378
			}
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Ldv;I)Z",
		garbageValue = "2083304706"
	)
	static boolean method172(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 4968
			return false;
		} else {
			boolean var1;
			if (MusicPatchNode.localPlayer != var0) { // L: 4969
				var1 = (Client.drawPlayerNames & 4) != 0; // L: 4972
				boolean var2 = var1; // L: 4974
				boolean var3;
				if (!var1) { // L: 4975
					var3 = (Client.drawPlayerNames & 1) != 0; // L: 4978
					var2 = var3 && var0.isFriend(); // L: 4980
				}

				var3 = var2; // L: 4982
				if (!var2) { // L: 4983
					boolean var4 = (Client.drawPlayerNames & 2) != 0; // L: 4986
					var3 = var4 && var0.isFriendsChatMember(); // L: 4988
				}

				return var3; // L: 4990
			} else {
				var1 = (Client.drawPlayerNames & 8) != 0; // L: 4995
				return var1; // L: 4997
			}
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-119"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (SoundSystem.loadInterface(var0)) { // L: 9966
			WorldMapSection2.field2877 = null; // L: 9973
			class11.drawInterface(VerticalAlignment.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 9974
			if (WorldMapSection2.field2877 != null) { // L: 9975
				class11.drawInterface(WorldMapSection2.field2877, -1412584499, var1, var2, var3, var4, class230.field2684, class101.field1328, var7); // L: 9976
				WorldMapSection2.field2877 = null; // L: 9977
			}

		} else {
			if (var7 != -1) { // L: 9967
				Client.field705[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 9969
					Client.field705[var8] = true;
				}
			}

		}
	} // L: 9971 9979

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1764409785"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 10804
	}
}
