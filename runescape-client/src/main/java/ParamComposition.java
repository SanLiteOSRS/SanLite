import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("ParamComposition_cached")
	public static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("w")
	@Export("type")
	char type;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1377513159
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("c")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("q")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 31

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1701434931"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.decodeNext(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "800980186"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			this.type = UrlRequest.method2530(var1.readByte()); // L: 43
		} else if (var2 == 2) { // L: 45
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false; // L: 46
		} else if (var2 == 5) { // L: 47
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 49

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2133855469"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 52
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "118"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) { // L: 237
			return true;
		} else if (!class438.Widget_archive.tryLoadGroup(var0)) { // L: 238
			return false;
		} else {
			int var1 = class438.Widget_archive.getGroupFileCount(var0); // L: 239
			if (var1 == 0) { // L: 240
				Widget.Widget_loadedInterfaces[var0] = true; // L: 241
				return true; // L: 242
			} else {
				if (class358.Widget_interfaceComponents[var0] == null) { // L: 244
					class358.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 245
					if (class358.Widget_interfaceComponents[var0][var2] == null) { // L: 246
						byte[] var3 = class438.Widget_archive.takeFile(var0, var2); // L: 247
						if (var3 != null) { // L: 248
							class358.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 249
							class358.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 250
							if (var3[0] == -1) { // L: 251
								class358.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								class358.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 252
							}
						}
					}
				}

				Widget.Widget_loadedInterfaces[var0] = true; // L: 256
				return true; // L: 257
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-927717931"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 169
			if (KeyHandler.field139 == KeyHandler.field141) { // L: 170
				return false;
			} else {
				class145.field1653 = KeyHandler.field144[KeyHandler.field139]; // L: 171
				WallObject.field2636 = KeyHandler.field125[KeyHandler.field139]; // L: 172
				KeyHandler.field139 = KeyHandler.field139 + 1 & 127; // L: 173
				return true; // L: 174
			}
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2065757413"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 11968

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 11969
			var1.clearIsFromIgnored(); // L: 11971
		}

		if (class19.friendsChatManager != null) { // L: 11975
			class19.friendsChatManager.invalidateIgnoreds(); // L: 11976
		}

	} // L: 11978

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1050807698"
	)
	static final void method3508() {
		Client.field710 = Client.cycleCntr; // L: 11988
	} // L: 11989
}
