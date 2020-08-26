import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lcv;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		signature = "[Llp;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("s")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("t")
	@Export("map")
	Map map;
	@ObfuscatedName("i")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("o")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 9168454196616585073L
	)
	long field1295;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = NetFileRequest.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = Script.method2324(var2);
			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (NetFileRequest.archive2.method4350(15)) {
			var2 = NetFileRequest.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-500127476"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "-31"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;I)V",
		garbageValue = "-1549127087"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IB)Ljava/lang/String;",
		garbageValue = "95"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;I)V",
		garbageValue = "1427019178"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IB)Ljava/lang/String;",
		garbageValue = "106"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-69"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) {
			this.strings[var1] = null;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(ZI)Lmy;",
		garbageValue = "-850108574"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class2.getPreferencesFile("2", Tiles.field532.name, var1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "67"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next();
				int var6 = (Integer)var5.getKey();
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += Decimator.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var27 = new Buffer(var2);
			var27.writeByte(2);
			var27.writeShort(var3);
			Iterator var28 = this.map.entrySet().iterator();

			label148:
			while (true) {
				Entry var16;
				int var17;
				do {
					if (!var28.hasNext()) {
						var1.write(var27.array, 0, var27.offset);
						break label148;
					}

					var16 = (Entry)var28.next();
					var17 = (Integer)var16.getKey();
				} while(!this.intsPersistence[var17]);

				var27.writeShort(var17);
				Object var8 = var16.getValue();
				Class var10 = var8.getClass();
				class3[] var11 = class3.method47();
				int var12 = 0;

				class3 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null;
						break;
					}

					class3 var13 = var11[var12];
					if (var10 == var13.field17) {
						var9 = var13;
						break;
					}

					++var12;
				}

				var27.writeByte(var9.field16);
				class3.method43(var8, var27);
			}
		} catch (Exception var25) {
		} finally {
			try {
				var1.close();
			} catch (Exception var24) {
			}

		}

		this.unwrittenChanges = false;
		this.field1295 = PacketWriter.currentTimeMillis();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "2"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		try {
			byte[] var2 = new byte[(int)var1.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var1.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new EOFException();
				}
			}

			Buffer var14 = new Buffer(var2);
			if (var14.array.length - var14.offset < 1) {
				return;
			}

			int var15 = var14.readUnsignedByte();
			if (var15 < 0 || var15 > 2) {
				return;
			}

			int var7;
			int var8;
			int var9;
			int var16;
			if (var15 >= 2) {
				var16 = var14.readUnsignedShort();

				for (var7 = 0; var7 < var16; ++var7) {
					var8 = var14.readUnsignedShort();
					var9 = var14.readUnsignedByte();
					class3 var10 = (class3)TextureProvider.findEnumerated(class3.method47(), var9);
					Object var11 = var10.method46(var14);
					if (this.intsPersistence[var8]) {
						this.map.put(var8, var11);
					}
				}
			} else {
				var16 = var14.readUnsignedShort();

				for (var7 = 0; var7 < var16; ++var7) {
					var8 = var14.readUnsignedShort();
					var9 = var14.readInt();
					if (this.intsPersistence[var8]) {
						this.map.put(var8, var9);
					}
				}

				var7 = var14.readUnsignedShort();

				for (var8 = 0; var8 < var7; ++var8) {
					var14.readUnsignedShort();
					var14.readStringCp1252NullTerminated();
				}
			}
		} catch (Exception var25) {
		} finally {
			try {
				var1.close();
			} catch (Exception var24) {
			}

		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "89"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1295 < PacketWriter.currentTimeMillis() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1436880111"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lic;I)V",
		garbageValue = "-1997146185"
	)
	public static void method2257(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}
}
