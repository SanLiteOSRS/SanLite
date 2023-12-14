import java.util.ArrayList;
import java.util.Iterator;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bv")
public class class30 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "358922906"
	)
	static void method463(ArrayList var0, boolean var1) {
		if (!var1) { // L: 201
			class316.field3424.clear(); // L: 202
		}

		Iterator var2 = var0.iterator(); // L: 204

		while (var2.hasNext()) {
			class328 var3 = (class328)var2.next(); // L: 205
			if (var3.field3523 != -1 && var3.field3531 != -1) { // L: 207
				if (!var1) { // L: 210
					class316.field3424.add(var3); // L: 211
				}

				class316.field3416.add(var3); // L: 213
			}
		}

	} // L: 216

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-2029161315"
	)
	static int method462(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : HealthBar.field1302; // L: 1533
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1534
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.itemId; // L: 1535
			return 1; // L: 1536
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1538
			if (var3.itemId != -1) { // L: 1539
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 1540
			}

			return 1; // L: 1541
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1543
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1544
			return 1; // L: 1545
		} else if (var0 == 1707) { // L: 1547
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.method6682() ? 1 : 0; // L: 1548
			return 1; // L: 1549
		} else if (var0 == 1708) { // L: 1551
			return class310.method5938(var3); // L: 1552
		} else {
			return var0 == 1709 ? GrandExchangeOfferTotalQuantityComparator.method7080(var3) : 2; // L: 1554 1555 1557
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1158445957"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 383
		int var2 = var1.readUnsignedByte(); // L: 384
		int var3 = var1.readInt(); // L: 385
		if (var3 < 0 || AbstractArchive.field4303 != 0 && var3 > AbstractArchive.field4303) { // L: 386
			throw new RuntimeException(); // L: 387
		} else if (var2 == 0) { // L: 389
			byte[] var6 = new byte[var3]; // L: 390
			var1.readBytes(var6, 0, var3); // L: 391
			return var6; // L: 392
		} else {
			int var4 = var1.readInt(); // L: 395
			if (var4 >= 0 && (AbstractArchive.field4303 == 0 || var4 <= AbstractArchive.field4303)) { // L: 396
				byte[] var5 = new byte[var4]; // L: 399
				if (var2 == 1) { // L: 400
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 401
				}

				return var5; // L: 402
			} else {
				throw new RuntimeException(); // L: 397
			}
		}
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1125993888"
	)
	static final void method465(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : ItemContainer.guestClanChannel; // L: 12708
		if (var2 != null && var1 >= 0 && var1 < var2.method3479()) { // L: 12709
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12710
			if (var3.rank == -1) { // L: 12711
				String var4 = var3.username.getName(); // L: 12712
				PacketBufferNode var5 = class113.getPacketBufferNode(ClientPacket.field3210, Client.packetWriter.isaacCipher); // L: 12713
				var5.packetBuffer.writeByte(3 + ClanChannel.stringCp1252NullTerminatedByteSize(var4)); // L: 12714
				var5.packetBuffer.writeByte(var0); // L: 12715
				var5.packetBuffer.writeShort(var1); // L: 12716
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12717
				Client.packetWriter.addNode(var5); // L: 12718
			}
		}
	} // L: 12719
}
