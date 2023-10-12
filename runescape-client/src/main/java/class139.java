import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class139 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 819829641
	)
	int field1605;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[Lfz;"
	)
	public class132[][] field1603;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[Lfz;"
	)
	class132[][] field1610;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	public Skeleton field1606;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 629474045
	)
	int field1607;
	@ObfuscatedName("ah")
	boolean field1608;
	@ObfuscatedName("am")
	Future field1609;
	@ObfuscatedName("av")
	List field1604;

	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;IZ)V",
		garbageValue = "0"
	)
	public class139(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1603 = null; // L: 21
		this.field1610 = null; // L: 22
		this.field1607 = 0; // L: 24
		this.field1605 = var3; // L: 32
		byte[] var5 = var1.takeFile(this.field1605 >> 16 & 65535, this.field1605 & 65535); // L: 33
		Buffer var6 = new Buffer(var5); // L: 34
		int var7 = var6.readUnsignedByte(); // L: 35
		int var8 = var6.readUnsignedShort(); // L: 36
		byte[] var9 = var2.getFile(var8, 0); // L: 39
		this.field1606 = new Skeleton(var8, var9);
		this.field1604 = new ArrayList();
		this.field1609 = SoundCache.field333.submit(new class136(this, var6, var7)); // L: 42
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "2000104113"
	)
	void method3103(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort(); // L: 53
		this.field1607 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort(); // L: 55
		this.field1610 = new class132[this.field1606.method4657().method4604()][];
		this.field1603 = new class132[this.field1606.method4654()][];
		class131[] var4 = new class131[var3];

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) { // L: 59
			class133 var12 = class406.method7419(var1.readUnsignedByte());
			var7 = var1.readShortSmart();
			class134 var13 = class179.method3553(var1.readUnsignedByte()); // L: 62
			class132 var14 = new class132();
			var14.method3029(var1, var2);
			var4[var5] = new class131(this, var14, var12, var13, var7); // L: 65
			int var10 = var12.method3048(); // L: 66
			class132[][] var15;
			if (var12 == class133.field1569) { // L: 68
				var15 = this.field1610;
			} else {
				var15 = this.field1603;
			}

			if (var15[var7] == null) {
				var15[var7] = new class132[var10];
			}

			if (var12 == class133.field1565) {
				this.field1608 = true;
			}
		}

		var5 = var3 / MusicPatchPcmStream.field3510;
		int var6 = var3 % MusicPatchPcmStream.field3510;
		int var8 = 0; // L: 84

		for (int var9 = 0; var9 < MusicPatchPcmStream.field3510; ++var9) { // L: 85
			var7 = var8; // L: 86
			var8 += var5; // L: 87
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var8 == var7) {
				break;
			}

			this.field1604.add(SoundCache.field333.submit(new class138(this, var7, var8, var4)));
		}

	} // L: 107

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public boolean method3091() {
		if (this.field1609 == null && this.field1604 == null) {
			return true;
		} else {
			if (this.field1609 != null) { // L: 113
				if (!this.field1609.isDone()) {
					return false;
				}

				this.field1609 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1604.size(); ++var2) { // L: 120
				if (!((Future)this.field1604.get(var2)).isDone()) {
					var1 = false; // L: 122
				} else {
					this.field1604.remove(var2); // L: 125
					--var2; // L: 126
				}
			}

			if (!var1) { // L: 129
				return false; // L: 130
			} else {
				this.field1604 = null; // L: 132
				return true; // L: 133
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-17"
	)
	public int method3107() {
		return this.field1607; // L: 137
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-19"
	)
	public boolean method3088() {
		return this.field1608; // L: 141
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILed;III)V",
		garbageValue = "2056920821"
	)
	public void method3089(int var1, class129 var2, int var3, int var4) {
		class465 var5 = ParamComposition.method3936(); // L: 145
		this.method3090(var5, var3, var2, var1); // L: 146
		this.method3086(var5, var3, var2, var1); // L: 147
		this.method3097(var5, var3, var2, var1); // L: 148
		var2.method2988(var5); // L: 149
		var5.method8399(); // L: 150
	} // L: 151

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrb;ILed;II)V",
		garbageValue = "8414091"
	)
	void method3090(class465 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method2972(this.field1607); // L: 154
		float var6 = var5[0]; // L: 155
		float var7 = var5[1]; // L: 156
		float var8 = var5[2]; // L: 157
		if (this.field1610[var2] != null) { // L: 158
			class132 var9 = this.field1610[var2][0]; // L: 159
			class132 var10 = this.field1610[var2][1]; // L: 160
			class132 var11 = this.field1610[var2][2]; // L: 161
			if (var9 != null) { // L: 162
				var6 = var9.method3022(var4);
			}

			if (var10 != null) { // L: 163
				var7 = var10.method3022(var4);
			}

			if (var11 != null) { // L: 164
				var8 = var11.method3022(var4);
			}
		}

		class464 var16 = Friend.method8028(); // L: 166
		var16.method8318(1.0F, 0.0F, 0.0F, var6); // L: 167
		class464 var14 = Friend.method8028(); // L: 168
		var14.method8318(0.0F, 1.0F, 0.0F, var7); // L: 169
		class464 var15 = Friend.method8028(); // L: 170
		var15.method8318(0.0F, 0.0F, 1.0F, var8); // L: 171
		class464 var12 = Friend.method8028(); // L: 172
		var12.method8326(var15); // L: 173
		var12.method8326(var16); // L: 174
		var12.method8326(var14); // L: 175
		class465 var13 = ParamComposition.method3936(); // L: 176
		var13.method8368(var12); // L: 177
		var1.method8359(var13); // L: 178
		var16.method8338(); // L: 179
		var14.method8338(); // L: 180
		var15.method8338(); // L: 181
		var12.method8338(); // L: 182
		var13.method8399(); // L: 183
	} // L: 184

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrb;ILed;II)V",
		garbageValue = "1859229364"
	)
	void method3097(class465 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method2981(this.field1607); // L: 187
		float var6 = var5[0]; // L: 188
		float var7 = var5[1]; // L: 189
		float var8 = var5[2]; // L: 190
		if (this.field1610[var2] != null) { // L: 191
			class132 var9 = this.field1610[var2][3]; // L: 192
			class132 var10 = this.field1610[var2][4]; // L: 193
			class132 var11 = this.field1610[var2][5]; // L: 194
			if (var9 != null) { // L: 195
				var6 = var9.method3022(var4);
			}

			if (var10 != null) { // L: 196
				var7 = var10.method3022(var4);
			}

			if (var11 != null) { // L: 197
				var8 = var11.method3022(var4);
			}
		}

		var1.field4785[12] = var6; // L: 199
		var1.field4785[13] = var7; // L: 200
		var1.field4785[14] = var8; // L: 201
	} // L: 202

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrb;ILed;IB)V",
		garbageValue = "2"
	)
	void method3086(class465 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method2974(this.field1607); // L: 205
		float var6 = var5[0]; // L: 206
		float var7 = var5[1]; // L: 207
		float var8 = var5[2]; // L: 208
		if (this.field1610[var2] != null) { // L: 209
			class132 var9 = this.field1610[var2][6]; // L: 210
			class132 var10 = this.field1610[var2][7]; // L: 211
			class132 var11 = this.field1610[var2][8]; // L: 212
			if (var9 != null) { // L: 213
				var6 = var9.method3022(var4);
			}

			if (var10 != null) { // L: 214
				var7 = var10.method3022(var4);
			}

			if (var11 != null) { // L: 215
				var8 = var11.method3022(var4);
			}
		}

		class465 var12 = ParamComposition.method3936(); // L: 217
		var12.method8380(var6, var7, var8); // L: 218
		var1.method8359(var12); // L: 219
		var12.method8399(); // L: 220
	} // L: 221

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "8"
	)
	public static void method3110(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			var0 = var0 + "-" + var1; // L: 41
		}

		UrlRequester.idxCount = var4; // L: 43
		FileSystem.cacheGamebuild = var3; // L: 44

		try {
			GrandExchangeOfferNameComparator.field4377 = System.getProperty("os.name"); // L: 46
		} catch (Exception var19) { // L: 48
			GrandExchangeOfferNameComparator.field4377 = "Unknown"; // L: 49
		}

		class223.field2350 = GrandExchangeOfferNameComparator.field4377.toLowerCase(); // L: 51
		DevicePcmPlayerProvider.userHomeDirectory = null; // L: 52

		try {
			DevicePcmPlayerProvider.userHomeDirectory = System.getProperty("jagex.userhome"); // L: 54
		} catch (Exception var18) { // L: 56
		}

		if (DevicePcmPlayerProvider.userHomeDirectory == null) {
			try {
				DevicePcmPlayerProvider.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var17) { // L: 60
			}
		}

		if (DevicePcmPlayerProvider.userHomeDirectory != null) { // L: 61
			DevicePcmPlayerProvider.userHomeDirectory = DevicePcmPlayerProvider.userHomeDirectory + "/";
		}

		try {
			if (class223.field2350.startsWith("win")) { // L: 63
				if (DevicePcmPlayerProvider.userHomeDirectory == null) { // L: 64
					DevicePcmPlayerProvider.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (DevicePcmPlayerProvider.userHomeDirectory == null) { // L: 67
				DevicePcmPlayerProvider.userHomeDirectory = System.getenv("HOME");
			}

			if (DevicePcmPlayerProvider.userHomeDirectory != null) { // L: 69
				DevicePcmPlayerProvider.userHomeDirectory = DevicePcmPlayerProvider.userHomeDirectory + "/";
			}
		} catch (Exception var16) { // L: 71
		}

		if (DevicePcmPlayerProvider.userHomeDirectory == null) { // L: 72
			DevicePcmPlayerProvider.userHomeDirectory = "~/";
		}

		FriendsList.field4675 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", DevicePcmPlayerProvider.userHomeDirectory, "/tmp/", ""}; // L: 73
		class27.field147 = new String[]{".jagex_cache_" + FileSystem.cacheGamebuild, ".file_store_" + FileSystem.cacheGamebuild}; // L: 74
		int var13 = 0;

		label121:
		while (var13 < 4) {
			class500.cacheDir = InvDefinition.method3617(var0, var2, var13); // L: 76
			if (!class500.cacheDir.exists()) { // L: 77
				class500.cacheDir.mkdirs();
			}

			File[] var6 = class500.cacheDir.listFiles(); // L: 78
			if (var6 == null) { // L: 79
				break;
			}

			File[] var7 = var6; // L: 81
			int var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label121;
				}

				File var9 = var7[var8]; // L: 83

				boolean var10;
				try {
					RandomAccessFile var11 = new RandomAccessFile(var9, "rw"); // L: 88
					int var12 = var11.read(); // L: 89
					var11.seek(0L); // L: 90
					var11.write(var12); // L: 91
					var11.seek(0L); // L: 92
					var11.close(); // L: 93
					var10 = true; // L: 95
				} catch (Exception var15) { // L: 97
					var10 = false; // L: 98
				}

				if (!var10) { // L: 101
					++var13; // L: 75
					break;
				}

				++var8; // L: 82
			}
		}

		File var5 = class500.cacheDir; // L: 108
		FileSystem.FileSystem_cacheDir = var5; // L: 110
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 111
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 112
			UserComparator5.method2904(); // L: 114
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(DecorativeObject.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 115
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(DecorativeObject.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 116
			UserComparator8.JagexCache_idxFiles = new BufferedFile[UrlRequester.idxCount]; // L: 117

			for (int var14 = 0; var14 < UrlRequester.idxCount; ++var14) { // L: 118
				UserComparator8.JagexCache_idxFiles[var14] = new BufferedFile(new AccessFile(DecorativeObject.getFile("main_file_cache.idx" + var14), "rw", 1048576L), 6000, 0); // L: 119
			}

		}
	} // L: 121

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1287194553"
	)
	static void method3111() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 57
	} // L: 58

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16777215"
	)
	static final void method3084() {
		int var0 = Players.Players_count; // L: 4163
		int[] var1 = Players.Players_indices; // L: 4164

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4165
			Player var3 = Client.players[var1[var2]]; // L: 4166
			if (var3 != null) { // L: 4167
				class6.updateActorSequence(var3, 1); // L: 4168
			}
		}

	} // L: 4171
}
