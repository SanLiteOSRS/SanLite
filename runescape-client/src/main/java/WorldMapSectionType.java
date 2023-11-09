import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements class345 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, (byte)1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(0, (byte)2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(1, (byte)3);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1816718813
	)
	@Export("type")
	final int type;
	@ObfuscatedName("q")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;I)V",
		garbageValue = "-414015759"
	)
	public static void method5233(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1; // L: 33
	} // L: 34

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "934969929"
	)
	public static void method5237() {
		try {
			File var0 = new File(UserComparator3.userHomeDirectory, "random.dat"); // L: 193
			int var2;
			if (var0.exists()) { // L: 194
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 195
			} else {
				label38:
				for (int var1 = 0; var1 < class89.cacheSubPaths.length; ++var1) { // L: 198
					for (var2 = 0; var2 < class121.cacheParentPaths.length; ++var2) { // L: 199
						File var3 = new File(class121.cacheParentPaths[var2] + class89.cacheSubPaths[var1] + File.separatorChar + "random.dat"); // L: 200
						if (var3.exists()) { // L: 201
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 202
							break label38; // L: 203
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 208
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 209
				var2 = var4.read(); // L: 210
				var4.seek(0L); // L: 211
				var4.write(var2); // L: 212
				var4.seek(0L); // L: 213
				var4.close(); // L: 214
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 215
			}
		} catch (IOException var5) { // L: 218
		}

	} // L: 219

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1437663571"
	)
	static final int method5234(int var0, int var1) {
		if (var0 == -2) { // L: 1024
			return 12345678;
		} else if (var0 == -1) { // L: 1025
			if (var1 < 2) {
				var1 = 2; // L: 1026
			} else if (var1 > 126) { // L: 1027
				var1 = 126;
			}

			return var1; // L: 1028
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1030
			if (var1 < 2) { // L: 1031
				var1 = 2;
			} else if (var1 > 126) { // L: 1032
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1033
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-632900931"
	)
	static void method5230() {
		Client.menuOptionsCount = 0; // L: 8733
		Client.isMenuOpen = false; // L: 8734
	} // L: 8735

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1176729619"
	)
	static final void method5236() {
		PacketBufferNode var0 = class136.getPacketBufferNode(ClientPacket.field3099, Client.packetWriter.isaacCipher); // L: 12299
		Client.packetWriter.addNode(var0); // L: 12300
		Interpreter.field868 = true; // L: 12301

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12302
			if (var1.type == 0 || var1.type == 3) { // L: 12303
				class9.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12305
			class69.invalidateWidget(Client.meslayerContinueWidget); // L: 12306
			Client.meslayerContinueWidget = null; // L: 12307
		}

		Interpreter.field868 = false; // L: 12309
	} // L: 12310
}
