import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("aw")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("al")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 1065401371674352517L
	)
	long field1744;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1100280045
	)
	public int field1754;
	@ObfuscatedName("as")
	@Export("name")
	public String name;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 379619733
	)
	int field1752;
	@ObfuscatedName("az")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("ao")
	public byte field1746;
	@ObfuscatedName("au")
	public byte field1748;
	@ObfuscatedName("ak")
	public byte field1743;
	@ObfuscatedName("ah")
	public byte field1742;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1279873755
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("af")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("ax")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("an")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ag")
	int[] field1749;
	@ObfuscatedName("am")
	public int[] field1750;
	@ObfuscatedName("ad")
	public boolean[] field1751;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1931266751
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 557255761
	)
	public int field1753;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 774154635
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("ac")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("ab")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("av")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1754 = 0; // L: 14
		this.name = null; // L: 15
		this.field1752 = 0;
		this.currentOwner = -1;
		this.field1753 = -1;
		this.method3339(var1); // L: 43
	} // L: 44

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1338020407"
	)
	void method3320(int var1) {
		if (this.useHashes) { // L: 47
			if (this.memberHashes != null) { // L: 48
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1]; // L: 49
			}
		}

		if (this.useNames) { // L: 51
			if (this.memberNames != null) { // L: 52
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1]; // L: 53
			}
		}

		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount); // L: 55
		} else {
			this.memberRanks = new byte[var1]; // L: 56
		}

		if (this.field1749 != null) { // L: 57
			System.arraycopy(this.field1749, 0, this.field1749 = new int[var1], 0, this.memberCount);
		} else {
			this.field1749 = new int[var1]; // L: 58
		}

		if (this.field1750 != null) { // L: 59
			System.arraycopy(this.field1750, 0, this.field1750 = new int[var1], 0, this.memberCount);
		} else {
			this.field1750 = new int[var1]; // L: 60
		}

		if (this.field1751 != null) {
			System.arraycopy(this.field1751, 0, this.field1751 = new boolean[var1], 0, this.memberCount); // L: 61
		} else {
			this.field1751 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-22531"
	)
	void method3321(int var1) {
		if (this.useHashes) { // L: 66
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount); // L: 67
			} else {
				this.bannedMemberHashes = new long[var1]; // L: 68
			}
		}

		if (this.useNames) { // L: 70
			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount); // L: 71
			} else {
				this.bannedMemberNames = new String[var1]; // L: 72
			}
		}

	} // L: 74

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "54"
	)
	public int method3390(String var1) {
		if (var1 != null && var1.length() != 0) { // L: 77
			for (int var2 = 0; var2 < this.memberCount; ++var2) { // L: 78
				if (this.memberNames[var2].equals(var1)) { // L: 79
					return var2;
				}
			}

			return -1; // L: 81
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "334090417"
	)
	public int method3381(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field1749[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "1507115417"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) { // L: 90
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1); // L: 91
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null; // L: 92 93
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1699849616"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 97
			String[] var1 = new String[this.memberCount]; // L: 98
			this.sortedMembers = new int[this.memberCount]; // L: 99

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) { // L: 100 103
				var1[var2] = this.memberNames[var2]; // L: 101
				if (var1[var2] != null) { // L: 102
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			class237.method4614(var1, this.sortedMembers); // L: 105
		}

		return this.sortedMembers; // L: 107
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "1057241996"
	)
	void method3362(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 111
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 112
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 113
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 114
				this.method3320(this.memberCount + 5);
			}

			if (this.memberHashes != null) { // L: 115
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) { // L: 116
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) { // L: 117
				this.currentOwner = this.memberCount; // L: 118
				this.memberRanks[this.memberCount] = 126; // L: 119
			} else {
				this.memberRanks[this.memberCount] = 0; // L: 122
			}

			this.field1749[this.memberCount] = 0; // L: 124
			this.field1750[this.memberCount] = var4; // L: 125
			this.field1751[this.memberCount] = false; // L: 126
			++this.memberCount; // L: 127
			this.sortedMembers = null; // L: 128
		}
	} // L: 129

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1782415866"
	)
	void method3327(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) { // L: 132
			--this.memberCount; // L: 133
			this.sortedMembers = null; // L: 134
			if (this.memberCount == 0) { // L: 135
				this.memberHashes = null; // L: 136
				this.memberNames = null; // L: 137
				this.memberRanks = null; // L: 138
				this.field1749 = null; // L: 139
				this.field1750 = null; // L: 140
				this.field1751 = null; // L: 141
				this.currentOwner = -1; // L: 142
				this.field1753 = -1; // L: 143
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 146
				System.arraycopy(this.field1749, var1 + 1, this.field1749, var1, this.memberCount - var1); // L: 147
				System.arraycopy(this.field1750, var1 + 1, this.field1750, var1, this.memberCount - var1); // L: 148
				System.arraycopy(this.field1751, var1 + 1, this.field1751, var1, this.memberCount - var1); // L: 149
				if (this.memberHashes != null) { // L: 150
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) { // L: 151
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner(); // L: 152
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 154

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2131362890"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 157
			this.currentOwner = -1; // L: 158
			this.field1753 = -1; // L: 159
		} else {
			this.currentOwner = -1; // L: 162
			this.field1753 = -1; // L: 163
			int var1 = 0; // L: 164
			byte var2 = this.memberRanks[0]; // L: 165

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 166
				if (this.memberRanks[var3] > var2) { // L: 167
					if (var2 == 125) { // L: 168
						this.field1753 = var1;
					}

					var1 = var3; // L: 169
					var2 = this.memberRanks[var3]; // L: 170
				} else if (this.field1753 == -1 && this.memberRanks[var3] == 125) { // L: 172
					this.field1753 = var3; // L: 173
				}
			}

			this.currentOwner = var1; // L: 176
			if (this.currentOwner != -1) { // L: 177
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 160 178

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "-968127802"
	)
	void method3334(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 181
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 182
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 183
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 184
				this.method3321(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) { // L: 185
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) { // L: 186
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount; // L: 187
		}
	} // L: 188

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "18"
	)
	void method3330(int var1) {
		--this.bannedMemberCount; // L: 191
		if (this.bannedMemberCount == 0) { // L: 192
			this.bannedMemberHashes = null; // L: 193
			this.bannedMemberNames = null; // L: 194
		} else {
			if (this.bannedMemberHashes != null) { // L: 197
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1); // L: 198
			}
		}

	} // L: 200

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IBS)I",
		garbageValue = "-8867"
	)
	int method3359(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 203
			if (this.currentOwner == var1 && (this.field1753 == -1 || this.memberRanks[this.field1753] < 125)) { // L: 204
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1; // L: 205
			} else {
				this.memberRanks[var1] = var2; // L: 206
				this.updateOwner(); // L: 207
				return var1; // L: 208
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "166755877"
	)
	boolean method3364(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 212
			this.memberRanks[this.currentOwner] = 125; // L: 213
			this.field1753 = this.currentOwner; // L: 214
			this.memberRanks[var1] = 126; // L: 215
			this.currentOwner = var1; // L: 216
			return true; // L: 217
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "0"
	)
	int method3345(int var1, boolean var2) {
		if (this.field1751[var1] == var2) { // L: 221
			return -1;
		} else {
			this.field1751[var1] = var2; // L: 222
			return var1; // L: 223
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1135173959"
	)
	int method3391(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 227
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 228
		int var7 = var6 ^ var5; // L: 229
		var2 <<= var3; // L: 230
		var2 &= var7; // L: 231
		int var8 = this.field1749[var1]; // L: 232
		if ((var8 & var7) == var2) {
			return -1; // L: 233
		} else {
			var8 &= ~var7; // L: 234
			this.field1749[var1] = var8 | var2; // L: 235
			return var1; // L: 236
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "28"
	)
	boolean method3335(int var1, int var2) {
		if (this.parameters != null) { // L: 240
			Node var3 = this.parameters.get((long)var1); // L: 241
			if (var3 != null) { // L: 242
				if (var3 instanceof IntegerNode) { // L: 243
					IntegerNode var4 = (IntegerNode)var3; // L: 244
					if (var2 == var4.integer) { // L: 245
						return false;
					}

					var4.integer = var2; // L: 246
					return true; // L: 247
				}

				var3.remove(); // L: 249
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 252
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 253
		return true; // L: 254
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-2123031743"
	)
	boolean method3319(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 258
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 259
		int var7 = var6 ^ var5; // L: 260
		var2 <<= var3; // L: 261
		var2 &= var7; // L: 262
		if (this.parameters != null) { // L: 263
			Node var8 = this.parameters.get((long)var1); // L: 264
			if (var8 != null) { // L: 265
				if (var8 instanceof IntegerNode) { // L: 266
					IntegerNode var9 = (IntegerNode)var8; // L: 267
					if ((var9.integer & var7) == var2) { // L: 268
						return false;
					}

					var9.integer &= ~var7; // L: 269
					var9.integer |= var2; // L: 270
					return true; // L: 271
				}

				var8.remove(); // L: 273
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 276
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 277
		return true; // L: 278
	}

	@ObfuscatedName("am")
	boolean method3337(int var1, long var2) {
		if (this.parameters != null) { // L: 282
			Node var4 = this.parameters.get((long)var1); // L: 283
			if (var4 != null) { // L: 284
				if (var4 instanceof class489) { // L: 285
					class489 var5 = (class489)var4; // L: 286
					if (var2 == var5.field4915) { // L: 287
						return false;
					}

					var5.field4915 = var2; // L: 288
					return true; // L: 289
				}

				var4.remove(); // L: 291
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 294
		}

		this.parameters.put(new class489(var2), (long)var1); // L: 295
		return true; // L: 296
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Z",
		garbageValue = "84"
	)
	boolean method3338(int var1, String var2) {
		if (var2 == null) { // L: 300
			var2 = "";
		} else if (var2.length() > 80) { // L: 301
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) { // L: 302
			Node var3 = this.parameters.get((long)var1); // L: 303
			if (var3 != null) { // L: 304
				if (var3 instanceof ObjectNode) { // L: 305
					ObjectNode var4 = (ObjectNode)var3; // L: 306
					if (var4.obj instanceof String) { // L: 307
						if (var2.equals(var4.obj)) { // L: 308
							return false;
						}

						var4.remove(); // L: 309
						this.parameters.put(new ObjectNode(var2), var4.key); // L: 310
						return true; // L: 311
					}
				}

				var3.remove(); // L: 314
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 317
		}

		this.parameters.put(new ObjectNode(var2), (long)var1); // L: 318
		return true; // L: 319
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "-26"
	)
	void method3339(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 323
		if (var2 >= 1 && var2 <= 6) { // L: 324
			int var3 = var1.readUnsignedByte(); // L: 325
			if ((var3 & 1) != 0) { // L: 326
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) { // L: 327
				this.useNames = true;
			}

			if (!this.useHashes) { // L: 328
				this.memberHashes = null; // L: 329
				this.bannedMemberHashes = null; // L: 330
			}

			if (!this.useNames) { // L: 332
				this.memberNames = null; // L: 333
				this.bannedMemberNames = null; // L: 334
			}

			this.field1754 = var1.readInt(); // L: 336
			this.field1752 = var1.readInt(); // L: 337
			if (var2 <= 3 && this.field1752 != 0) { // L: 338
				this.field1752 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 339
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 340
			this.name = var1.readStringCp1252NullTerminated(); // L: 341
			if (var2 >= 4) { // L: 342
				var1.readInt(); // L: 343
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 345
			this.field1746 = var1.readByte(); // L: 346
			this.field1748 = var1.readByte(); // L: 347
			this.field1743 = var1.readByte(); // L: 348
			this.field1742 = var1.readByte(); // L: 349
			int var4;
			if (this.memberCount > 0) { // L: 350
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) { // L: 351
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) { // L: 352
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) { // L: 353
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1749 == null || this.field1749.length < this.memberCount) { // L: 354
					this.field1749 = new int[this.memberCount];
				}

				if (this.field1750 == null || this.field1750.length < this.memberCount) { // L: 355
					this.field1750 = new int[this.memberCount];
				}

				if (this.field1751 == null || this.field1751.length < this.memberCount) { // L: 356
					this.field1751 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) { // L: 357
					if (this.useHashes) { // L: 358
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 359
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte(); // L: 360
					if (var2 >= 2) { // L: 361
						this.field1749[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 362
						this.field1750[var4] = var1.readUnsignedShort();
					} else {
						this.field1750[var4] = 0; // L: 363
					}

					if (var2 >= 6) { // L: 364
						this.field1751[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1751[var4] = false; // L: 365
					}
				}

				this.updateOwner(); // L: 367
			}

			if (this.bannedMemberCount > 0) { // L: 369
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) { // L: 370
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) { // L: 371
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) { // L: 372
					if (this.useHashes) { // L: 373
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 374
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) { // L: 377
				var4 = var1.readUnsignedShort(); // L: 378
				if (var4 > 0) { // L: 379
					this.parameters = new IterableNodeHashTable(var4 < 16 ? class318.method6083(var4) : 16); // L: 380

					while (var4-- > 0) { // L: 381
						int var5 = var1.readInt(); // L: 382
						int var6 = var5 & 1073741823; // L: 383
						int var7 = var5 >>> 30; // L: 384
						if (var7 == 0) { // L: 385
							int var12 = var1.readInt(); // L: 386
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 387
						} else if (var7 == 1) { // L: 389
							long var10 = var1.readLong(); // L: 390
							this.parameters.put(new class489(var10), (long)var6); // L: 391
						} else if (var7 == 2) { // L: 393
							String var8 = var1.readStringCp1252NullTerminated(); // L: 394
							this.parameters.put(new ObjectNode(var8), (long)var6); // L: 395
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 400

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "365243481"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(class154.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1464481394"
	)
	static final float method3332(int var0) {
		float var1 = 10075.0F - (float)var0; // L: 17
		return (var1 * 1.0075567F - 75.56675F) / var1; // L: 18
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "2"
	)
	static final void method3336(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ArchiveLoader.field1070.method6437(var0)) { // L: 11486
			class161.updateInterface(ArchiveLoader.field1070.field3633[var0], -1, var1, var2, var3, var4, var5, var6); // L: 11487
		}
	} // L: 11488
}
