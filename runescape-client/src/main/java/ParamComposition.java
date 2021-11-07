import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = -1783961739
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("s")
	@Export("type")
	char type;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1115055465
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("o")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("g")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1854447416"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;B)V",
		garbageValue = "2"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lop;IB)V",
		garbageValue = "-109"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.type = class274.method5199(var1.readByte());
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1612444577"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	static void method3216() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-329455950"
	)
	static final int method3229() {
		return ViewportMouse.ViewportMouse_y;
	}
}
