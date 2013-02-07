/*
 * Copyright (c) 2013, Francis Galiegue <fgaliegue@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.fge.jsonschema.keyword.validator.draftv4;

import com.github.fge.jsonschema.keyword.validator.CallbackKeywordValidatorTest;
import com.github.fge.jsonschema.library.validator.DraftV4ValidatorDictionary;
import com.github.fge.jsonschema.ref.JsonPointer;

public abstract class DraftV4CallbackKeywordValidatorTest
    extends CallbackKeywordValidatorTest
{
    protected DraftV4CallbackKeywordValidatorTest(final String keyword,
        final JsonPointer ptr1, final JsonPointer ptr2)
    {
        super(DraftV4ValidatorDictionary.get(), keyword, ptr1, ptr2);
    }
}